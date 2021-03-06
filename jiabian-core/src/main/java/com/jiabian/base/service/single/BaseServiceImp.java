package com.jiabian.base.service.single;

import java.util.List;

import com.jiabian.base.mapper.single.BaseMapper;


public class BaseServiceImp<T,E> implements IBaseService<T,E> {
	
	protected BaseMapper<T,E> baseMapper;
	public void setBaseMapper(BaseMapper<T, E> baseMapper) {
		this.baseMapper = baseMapper;
	}
	
	@Override
	public int countByExample(E e) {
		return baseMapper.countByExample(e);
	}

	@Override
	public int deleteByExample(E e) {
		return baseMapper.deleteByExample(e);
	}

	@Override
	public int deleteByPrimaryKey(T t) {
		return baseMapper.deleteByPrimaryKey(t);
	}

	@Override
	public long insert(T t) {
		return baseMapper.insert(t);
	}

	@Override
	public long insertSelective(T t) {
		return baseMapper.insertSelective(t);
	}

	@Override
	public List<T> selectByExample(E e) {
		return baseMapper.selectByExample(e);
	}

	@Override
	public T selectByPrimaryKey(T t) {
		return baseMapper.selectByPrimaryKey(t);
	}

	@Override
	public int updateByExampleSelective(T t, E e) {
		return baseMapper.updateByExampleSelective(t,e);
	}

	@Override
	public int updateByExample(T t, E e) {
		return baseMapper.updateByExample(t,e);
	}

	@Override
	public int updateByPrimaryKeySelective(T t) {
		return baseMapper.updateByPrimaryKeySelective(t);
	}

	@Override
	public int updateByPrimaryKey(T t) {
		return baseMapper.updateByPrimaryKey(t);
	}


	
}
