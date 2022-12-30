package com.proyecto.proyecto.service;

import com.proyecto.proyecto.model.DocumentTypeEntity;
import com.proyecto.proyecto.repository.DocumentTypeRepository;
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
public class DocumentTypeService implements DocumentTypeRepository{

    @Autowired
    private DocumentTypeRepository documentTypeRepository;

    @Override
    public void flush() {

    }

    @Override
    public <S extends DocumentTypeEntity> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends DocumentTypeEntity> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<DocumentTypeEntity> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public DocumentTypeEntity getOne(Long aLong) {
        return null;
    }

    @Override
    public DocumentTypeEntity getById(Long aLong) {
        return null;
    }

    @Override
    public DocumentTypeEntity getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends DocumentTypeEntity> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends DocumentTypeEntity> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends DocumentTypeEntity> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends DocumentTypeEntity> Page<S> findAll(Example<S> example, Pageable pageable) {
        return documentTypeRepository.findAll(example,pageable);
    }

    @Override
    public <S extends DocumentTypeEntity> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends DocumentTypeEntity> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends DocumentTypeEntity, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends DocumentTypeEntity> S save(S entity) {
        return documentTypeRepository.save(entity);
    }

    @Override
    public <S extends DocumentTypeEntity> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<DocumentTypeEntity> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<DocumentTypeEntity> findAll() {
        return documentTypeRepository.findAll();
    }

    @Override
    public List<DocumentTypeEntity> findAllById(Iterable<Long> longs) {
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
    public void delete(DocumentTypeEntity entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends DocumentTypeEntity> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<DocumentTypeEntity> findAll(Sort sort) {
        return documentTypeRepository.findAll(sort);
    }

    @Override
    public Page<DocumentTypeEntity> findAll(Pageable pageable) {
        return null;
    }
}
