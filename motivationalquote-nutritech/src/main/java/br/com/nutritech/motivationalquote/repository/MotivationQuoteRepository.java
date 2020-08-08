package br.com.nutritech.motivationalquote.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.nutritech.motivationalquote.model.MotivationalQuote;

public interface MotivationQuoteRepository extends JpaRepository<MotivationalQuote, Long> {

}
