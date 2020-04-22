package cn.appsys.service.developer;

import cn.appsys.dao.datadictionary.DataDictionaryMapper;
import cn.appsys.pojo.DataDictionary;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DataDictionaryServiceImpl implements DataDictionaryService {
@Resource
DataDictionaryMapper mapper;
    @Override
    public List<DataDictionary> getDataDictionaryList(String typeCode) throws Exception {
        return mapper.getDataDictionaryList(typeCode);
    }
}
