package fastwave.service.admin.config.dao;

import fastwave.lib.common.entity.DictTypeEntity;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import fastwave.service.admin.config.entity.Dict;

/**
 * 字典表
 * @author fastwave.developer
 * @date 2018-05-28 15:21:37
 * @Copyright: 2018 fastwave. All rights reserved. 
 * 注意：本内容仅限于信翰创武汉物联科技有限公司内部传阅，禁止外泄以及用于其他的商业目
 */
@Mapper
public interface DictDao {

	Dict get(Map<String, Object> params);
	
	List<Dict> list(Map<String,Object> map);
	
	int count(Map<String,Object> map);
	
	int save(Dict dict);
	
	int update(Dict dict);
	
	int remove(List<Long> ids);
	
	List<Dict> listType();
	
	List<DictTypeEntity> ListDictItems(Map<String, Object> params);
	
	List<DictTypeEntity> ListDictParents(Map<String, Object> params);
	
	Dict getByName(Map<String, Object> params);

	List<Map> treelist();

	String childMaxCode(Long parentId);
	
	int countExcelSelf(Map<String, Object> map);
	
	int countParse(Map<String, Object> params);
}