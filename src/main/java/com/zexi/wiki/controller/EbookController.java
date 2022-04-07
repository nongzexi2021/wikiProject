package com.zexi.wiki.controller;


import com.zexi.wiki.domain.EbookSaveReq;
import com.zexi.wiki.req.EbookQueryReq;
import com.zexi.wiki.resp.CommonResp;
import com.zexi.wiki.resp.EbookQueryResp;
import com.zexi.wiki.resp.PageResp;
import com.zexi.wiki.service.EbookService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

//@RestController return a string; @Controller: return a page
@RestController
@RequestMapping("/ebook")
public class EbookController {

    @Resource
    private EbookService ebookService;

    @GetMapping("/list")
    public CommonResp list(EbookQueryReq req) {
        CommonResp<PageResp<EbookQueryResp>> resp = new CommonResp<>();
        PageResp<EbookQueryResp> list = ebookService.list(req);
        resp.setContent(list);
        return resp;
    }

    @PostMapping("/save")
    public CommonResp save(@RequestBody EbookSaveReq req) {
        CommonResp resp = new CommonResp<>();
        ebookService.save(req);

        return resp;
    }
}
