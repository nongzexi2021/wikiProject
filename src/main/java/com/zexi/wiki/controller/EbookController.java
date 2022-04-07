package com.zexi.wiki.controller;


import com.zexi.wiki.req.EbookReq;
import com.zexi.wiki.resp.CommonResp;
import com.zexi.wiki.resp.EbookResp;
import com.zexi.wiki.resp.PageResp;
import com.zexi.wiki.service.EbookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

//@RestController return a string; @Controller: return a page
@RestController
@RequestMapping("/ebook")
public class EbookController {

    @Resource
    private EbookService ebookService;

    @GetMapping("/list")
    public CommonResp list(EbookReq req) {
        CommonResp<PageResp<EbookResp>> resp = new CommonResp<>();
        PageResp<EbookResp> list = ebookService.list(req);
        resp.setContent(list);
        return resp;
    }
}
