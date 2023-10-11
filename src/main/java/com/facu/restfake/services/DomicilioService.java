package com.facu.restfake.services;

import com.facu.restfake.entities.Domicilio;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface DomicilioService extends BaseService<Domicilio,Long> {
    Page<Domicilio> searchNativoCalle(String calle, Pageable pageable) throws Exception;
}
