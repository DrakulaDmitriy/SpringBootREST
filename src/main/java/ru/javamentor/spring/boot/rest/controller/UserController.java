package ru.javamentor.spring.boot.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.javamentor.spring.boot.rest.model.User;
import ru.javamentor.spring.boot.rest.service.RoleService;
import ru.javamentor.spring.boot.rest.service.UserService;

@Controller
@RequestMapping("/")
public class UserController {
    private final UserService userService;
    private final RoleService roleService;

    @Autowired
    public UserController(UserService userService, RoleService roleService) {
        this.userService = userService;
        this.roleService = roleService;
    }

    @GetMapping("login")
    public String getLoginPage() {
        return "login";
    }

    @GetMapping("user")
    public String showUserInfo(@AuthenticationPrincipal User user, Model model) {
        model.addAttribute("user", user);
        return "user_page";
    }

    @GetMapping("admin")
    public String showAdminPage(@AuthenticationPrincipal User user, Model model) {
        model.addAttribute("users", userService.getAllUsers());
        model.addAttribute("user", user);
        model.addAttribute("roles", roleService.getAllRoles());
        return "admin_page";
    }
}