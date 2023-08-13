package kz.techorda.finalTaskNews.controller;


import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ArtNewsController {

    @PreAuthorize("isAuthenticated()")
    @GetMapping(value = "/art_news")
    public String artNewsPage() {
        return "artNews";
    }

}