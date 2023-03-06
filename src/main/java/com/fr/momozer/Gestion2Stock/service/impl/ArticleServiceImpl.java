package com.fr.momozer.Gestion2Stock.service.impl;
import com.fr.momozer.Gestion2Stock.dto.ArticleDTO;
import com.fr.momozer.Gestion2Stock.exception.EntityNotFoundException;
import com.fr.momozer.Gestion2Stock.exception.ErrorCodes;
import com.fr.momozer.Gestion2Stock.exception.InvalidEntityException;
import com.fr.momozer.Gestion2Stock.model.Article;
import com.fr.momozer.Gestion2Stock.repository.ArticleRepository;
import com.fr.momozer.Gestion2Stock.service.ArticleService;
import com.fr.momozer.Gestion2Stock.validator.ArticleValidator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Slf4j
public class ArticleServiceImpl implements ArticleService {

    private ArticleRepository articleRepository;

    @Autowired
    public ArticleServiceImpl(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    @Override
    public ArticleDTO save(ArticleDTO dto) {
        List<String> errors = ArticleValidator.validate(dto);
        if (!errors.isEmpty()){
            log.error("Article is not valid {}", dto);
            throw  new InvalidEntityException("L'article n'est pas valide", ErrorCodes.ARTICLE_NOT_VALID);
        }


        return ArticleDTO.fromEntity
                (articleRepository.save(
                ArticleDTO.toEntity(dto)
        ));
    }

    @Override
    public ArticleDTO findById(Integer id) {

        if (id == null){
            log.error("Article ID is null");
            return null;
        }

        Optional<Article> article = articleRepository.findById(id);

        ArticleDTO dto = ArticleDTO.fromEntity(article.get());

        return Optional.of(dto).orElseThrow(() ->
                new EntityNotFoundException(
                        "Aucun article avec l'ID = " + id + " n'a été trouvé", ErrorCodes.ARTICLE_NOT_FOUND
                ));
    }

    @Override
    public ArticleDTO findByCodeArticle(String codeArticle) {

        if (!StringUtils.hasLength(codeArticle)){
            log.error("Article CODE is null");
        }

        Optional<Article> article = articleRepository.findArticleByCodeArticle(codeArticle);


        return Optional.of(ArticleDTO.fromEntity(article.get())).orElseThrow(() ->
                new EntityNotFoundException(
                        "Aucun article avec le CODE = " + codeArticle + " n'a été trouvé",
                        ErrorCodes.ARTICLE_NOT_FOUND
                )) ;
    }

    @Override
    public List<ArticleDTO> findAll() {
        return articleRepository.findAll().stream()
                .map(ArticleDTO::fromEntity)
                .collect(Collectors.toList());
    }

    @Override
    public void delete(Integer id) {
        if(id == null) {
            log.error("Article ID is null");
            return;
        }
        articleRepository.deleteById(id);
    }
}
