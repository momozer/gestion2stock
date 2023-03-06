package com.fr.momozer.Gestion2Stock.controller.api;

import com.fr.momozer.Gestion2Stock.dto.ArticleDTO;
import com.fr.momozer.Gestion2Stock.utils.Constants;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.fr.momozer.Gestion2Stock.utils.Constants.APP_ROOT;

public interface ArticleApi {
    @PostMapping(value = APP_ROOT + "/articles/create",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE )
    ArticleDTO save(@RequestBody ArticleDTO dto);

    @GetMapping(value = APP_ROOT + "/articles/{idArticle}",
            produces = MediaType.APPLICATION_JSON_VALUE)
    ArticleDTO findById(@PathVariable("idArticle") Integer id);

    @GetMapping(value = APP_ROOT + "/articles/{codeArticle}",
            produces = MediaType.APPLICATION_JSON_VALUE )
    ArticleDTO findByCodeArticle( @PathVariable("codeArticle") String codeArticle);

    @GetMapping(value = APP_ROOT + "/articles/all",
            produces = MediaType.APPLICATION_JSON_VALUE)
    List<ArticleDTO> findAll();

    @DeleteMapping(value = APP_ROOT + "/articles/delete/{idArticle}")
    void delete(@PathVariable("idArticle") Integer id);
}
