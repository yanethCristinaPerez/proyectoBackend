package com.proyecto.proyecto.service;

import com.proyecto.proyecto.model.InvoiceEntity;
import com.proyecto.proyecto.repository.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class InvoiceService implements InvoiceRepository{

    @Autowired
    private InvoiceRepository invoiceRepository;

    @Override
    public void flush() {

    }

    @Override
    public <S extends InvoiceEntity> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends InvoiceEntity> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<InvoiceEntity> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public InvoiceEntity getOne(Long aLong) {
        return null;
    }

    @Override
    public InvoiceEntity getById(Long aLong) {
        return null;
    }

    @Override
    public InvoiceEntity getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends InvoiceEntity> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends InvoiceEntity> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends InvoiceEntity> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends InvoiceEntity> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends InvoiceEntity> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends InvoiceEntity> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends InvoiceEntity, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends InvoiceEntity> S save(S entity) {
        return null;
    }

    @Override
    public <S extends InvoiceEntity> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<InvoiceEntity> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<InvoiceEntity> findAll() {
        return null;
    }

    @Override
    public List<InvoiceEntity> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(InvoiceEntity entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends InvoiceEntity> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<InvoiceEntity> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<InvoiceEntity> findAll(Pageable pageable) {
        return null;
    }
}
