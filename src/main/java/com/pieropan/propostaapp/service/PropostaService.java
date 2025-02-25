package com.pieropan.propostaapp.service;

import com.pieropan.propostaapp.Repository.PropostaRepository;
import com.pieropan.propostaapp.dto.PropostaRequestDto;
import com.pieropan.propostaapp.dto.PropostaResponseDto;
import com.pieropan.propostaapp.entity.Proposta;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class PropostaService {

    private PropostaRepository propostaRepository;


    public PropostaResponseDto criar(PropostaRequestDto requestDto){
        propostaRepository.save(new Proposta());
        return null;

    }
}
