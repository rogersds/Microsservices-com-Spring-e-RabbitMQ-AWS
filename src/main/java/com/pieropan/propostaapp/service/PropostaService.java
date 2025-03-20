package com.pieropan.propostaapp.service;

import com.pieropan.propostaapp.Mapper.PropostaMapper;
import com.pieropan.propostaapp.Repository.PropostaRepository;
import com.pieropan.propostaapp.dto.PropostaRequestDto;
import com.pieropan.propostaapp.dto.PropostaResponseDto;
import com.pieropan.propostaapp.entity.Proposta;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class PropostaService {

    private PropostaRepository propostaRepository;


    public PropostaResponseDto criar(PropostaRequestDto requestDto){
        Proposta proposta = PropostaMapper.INSTANCE.ConvertDtoToProposta(requestDto);
        propostaRepository.save(proposta);

        return PropostaMapper.INSTANCE.convertEntityToDto(proposta);

    }

    public List<PropostaResponseDto> obterProposta() {

        return PropostaMapper.INSTANCE.convertListEntityToListDto(propostaRepository.findAll());


    }
}
