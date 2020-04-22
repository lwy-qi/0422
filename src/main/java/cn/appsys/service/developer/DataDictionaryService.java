package cn.appsys.service.developer;

import cn.appsys.pojo.DataDictionary;

import java.util.List;

public interface DataDictionaryService {
    public List<DataDictionary> getDataDictionaryList(String typeCode)throws Exception;
}
