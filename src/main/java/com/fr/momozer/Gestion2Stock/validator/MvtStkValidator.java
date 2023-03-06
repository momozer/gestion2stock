package com.fr.momozer.Gestion2Stock.validator;

import com.fr.momozer.Gestion2Stock.dto.MvtStkDTO;
import net.bytebuddy.agent.builder.AgentBuilder;

import java.util.ArrayList;
import java.util.List;

public class MvtStkValidator {

    public static List<String> validate (MvtStkDTO dto) {
        List<String> errors = new ArrayList<>();

        if (dto == null) {
            errors.add("veuillez renseigner une date de mouvement de stock");
            errors.add("veuillez renseigner une quantite");
            errors.add("veuillez renseigner un article");
            return errors;
        }

        if(dto.getDateMvt() == null) {
            errors.add("veuillez renseigner une date de mouvement de stock");
        }
        if (dto.getQuantite() == null){
            errors.add("veuillez renseigner une quantite");
        }
        if (dto.getArticle() == null){
            errors.add("veuillez renseigner un article");
        }
        return errors;
    }
}
