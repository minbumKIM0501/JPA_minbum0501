package com.pratice.springjpa.order.model.service;

import com.pratice.springjpa.order.model.dto.CategoryDTO;
import com.pratice.springjpa.order.model.dto.OrderDTO;
import com.pratice.springjpa.order.model.entity.Category;
import com.pratice.springjpa.order.model.entity.Order;
import com.pratice.springjpa.order.model.repository.CategoryRepository;
import com.pratice.springjpa.order.model.repository.OrderRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    private final ModelMapper modelMapper;

    private final CategoryRepository categoryRepository;

    @Autowired
    public OrderService(OrderRepository orderRepository, ModelMapper modelMapper, CategoryRepository categoryRepository) {
        this.orderRepository = orderRepository;
        this.modelMapper = modelMapper;
        this.categoryRepository = categoryRepository;
    }

    public List<OrderDTO> findOrderList() {

        List<Order> orderList = orderRepository.findAll(Sort.by("musicalId").descending());

        return orderList.stream()
                .map(order -> modelMapper.map(order, OrderDTO.class))
                .collect(Collectors.toList());
    }

    public OrderDTO findOrderByCode( int musicleId ) {

        Order order = orderRepository.findById(musicleId).orElseThrow(IllegalAccessError::new);

        return modelMapper.map(order, OrderDTO.class);
    }

    public List<CategoryDTO> findAllCategory() {
        List<Category> categoryList = categoryRepository.findAllCategory();

        return categoryList.stream()
                .map(category -> modelMapper.map(category, CategoryDTO.class))
                .collect(Collectors.toList());
    }
    @Transactional
    public void registNewOrder(OrderDTO newOrder) {
        orderRepository.save(modelMapper.map(newOrder, Order.class));
    }

    @Transactional
    public void modifyOrder(OrderDTO modifyOrder) {
        Order orderList = orderRepository.findById(modifyOrder.getMusicalId()).orElseThrow(IllegalAccessError::new);

        orderList.setMusicalDate(modifyOrder.getMusicalDate());
    }

    @Transactional
    public void deleteOrder(Integer musicalId) {
        orderRepository.deleteById(musicalId);
    }

    public List<OrderDTO> findByMenuPrice(Integer musicalPrice) {
        List<Order> orderList = orderRepository.findByMusicalPriceGreaterThan(musicalPrice, Sort.by("musicalPrice").descending());

        return orderList.stream()
                .map(order -> modelMapper.map(order, OrderDTO.class))
                .collect(Collectors.toList());
    }
}

