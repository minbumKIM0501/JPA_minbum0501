package com.pratice.springjpa.order.controller;

import com.pratice.springjpa.order.model.dto.CategoryDTO;
import com.pratice.springjpa.order.model.dto.OrderDTO;
import com.pratice.springjpa.order.model.service.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/order")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }


    @GetMapping("/list")
    public String findOrderList(Model model){
        List<OrderDTO> orderList = orderService.findOrderList();

        model.addAttribute("orderList", orderList);

        return "order/list";
    }

    @GetMapping("/{musicleId}")
    public String findOrderByCode(@PathVariable int musicleId, Model model) {
        OrderDTO order = orderService.findOrderByCode(musicleId);

        model.addAttribute("order", order);

        return "order/detail";
    }

    @GetMapping(value = "/cateogry", produces = "application/json; charset=UTF-8")
    @ResponseBody
    public List<CategoryDTO> findCategoryList() {
        return orderService.findAllCategory();
    }

    @GetMapping("/regist")
    public void registPage(){}

    @PostMapping("/regist")
    public String registNewOrder(OrderDTO orderDTO) {
        orderService.registNewOrder(orderDTO);
        return "redirect:order/list";
    }
    @GetMapping("/modify")
    public void modifyPage(){}

    @PostMapping("/modify")
    public String modifyOrder(OrderDTO orderDTO) {
        orderService.modifyOrder(orderDTO);
        return "redirect:/order/" + orderDTO.getMusicalId();
    }
    @GetMapping("/delete")
    public void deletePage(){}

    @PostMapping("/delete")
    public String deleteOrder(@RequestParam Integer musicalPrice) {
        orderService.deleteOrder(musicalPrice);

        return "redirect:/order/list";
    }

    @GetMapping("/search")
    public String findByMusicalPrice(@RequestParam Integer musicalPrice,Model model) {
        List<OrderDTO> orderList = orderService.findByMenuPrice(musicalPrice);

        model.addAttribute("musicalList", orderList);
        model.addAttribute("musicalPrice", musicalPrice);

        return "order/searchResult";
    }


}
