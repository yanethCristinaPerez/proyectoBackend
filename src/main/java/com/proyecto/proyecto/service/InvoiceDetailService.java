package com.proyecto.proyecto.service;

import com.proyecto.proyecto.model.InvoiceDetailEntity;
import com.proyecto.proyecto.repository.InvoiceDetailRepository;
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
public class InvoiceDetailService implements InvoiceDetailRepository{

    @Autowired
    private InvoiceDetailRepository invoiceDetailRepository;

    @Override
    public void flush() {

    }

    @Override
    public <S extends InvoiceDetailEntity> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends InvoiceDetailEntity> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<InvoiceDetailEntity> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public InvoiceDetailEntity getOne(Long aLong) {
        return null;
    }

    @Override
    public InvoiceDetailEntity getById(Long aLong) {
        return null;
    }

    @Override
    public InvoiceDetailEntity getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends InvoiceDetailEntity> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends InvoiceDetailEntity> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends InvoiceDetailEntity> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends InvoiceDetailEntity> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends InvoiceDetailEntity> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends InvoiceDetailEntity> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends InvoiceDetailEntity, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends InvoiceDetailEntity> S save(S entity) {
        return null;
    }

    @Override
    public <S extends InvoiceDetailEntity> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<InvoiceDetailEntity> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<InvoiceDetailEntity> findAll() {
        return null;
    }

    @Override
    public List<InvoiceDetailEntity> findAllById(Iterable<Long> longs) {
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
    public void delete(InvoiceDetailEntity entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends InvoiceDetailEntity> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<InvoiceDetailEntity> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<InvoiceDetailEntity> findAll(Pageable pageable) {
        return null;
    }
}
