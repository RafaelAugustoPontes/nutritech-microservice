package br.com.nutritech.motivationalquote.service;

import java.util.Random;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.nutritech.motivationalquote.dto.MotivationalQuoteResponse;
import br.com.nutritech.motivationalquote.model.MotivationalQuote;
import br.com.nutritech.motivationalquote.repository.MotivationQuoteRepository;
import org.springframework.stereotype.Service;

@Service
public class MotivationalQuoteService {

	@Autowired
	private MotivationQuoteRepository motivationalQuoteRepository;
	private final ModelMapper modelMapper = new ModelMapper();

	public MotivationalQuoteResponse findRandom() {
		long count = motivationalQuoteRepository.count();
		Random random = new Random();
		Integer randomId = random.nextInt((int) count + 1);
		if (randomId == 0)
			randomId = 1;

		MotivationalQuote motivationalQuote = motivationalQuoteRepository.getOne(Long.valueOf(randomId.toString()));

		return modelMapper.map(motivationalQuote, MotivationalQuoteResponse.class);
	}

}
