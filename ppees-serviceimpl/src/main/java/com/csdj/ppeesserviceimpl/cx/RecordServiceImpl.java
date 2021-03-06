package com.csdj.ppeesserviceimpl.cx;

import com.csdj.mapper.cx.RecorMapper;
import com.csdj.pojo.*;
import com.csdj.service.cx.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Date;
import java.util.List;

@Service
public class RecordServiceImpl implements RecordService {

    @Autowired
    private RecorMapper mapper;

    public List<Record> getlistRecord(Integer rid, Date creationtime1,Date creationtime2, String fname,String bname,String  fcertificate,Date fbirth,String  bcertificate,Date birth,Integer curPageNo, Integer pageSize) {
        return mapper.getlistRecord(rid,creationtime1,creationtime2, fname,bname,fcertificate,fbirth,bcertificate,birth,(curPageNo - 1) * pageSize, pageSize);
    }

    @Override
    public int getLeaveCount(Integer rid,Date creationtime1,Date creationtime2, String fname,String bname,String  fcertificate,Date fbirth,String  bcertificate,Date birth) {
        return mapper.getLeaveCount(rid, creationtime1,creationtime2,fname,bname,fcertificate,fbirth,bcertificate,birth);
    }

    @Override
    public Record getid(Integer rid) {
        return mapper.getid(rid);
    }

    @Override
    public Integer addHealthCheckup(HealthCheckup healthCheckup) {
        return mapper.addHealthCheckup(healthCheckup);
    }

    @Override
    public List<SysUser> selectAllSysUser() {
        return mapper.selectAllSysUser();
    }

    @Override
    public List<Consent> selectAllconsent() {
        return mapper.selectAllconsent();
    }

    @Override
    public List<EducationLevel> selectAlleducation() {
        return mapper.selectAlleducation();
    }

    @Override
    public List<DocumentType> selectAlldocument() {
        return mapper.selectAlldocument();
    }

    @Override
    public Integer addRecord(Record record) {
        return mapper.addRecord(record);
    }

    @Override
    public Integer addGGeneral(GGeneral gGeneral) {
        return mapper.addGGeneral(gGeneral);
    }

    @Override
    public List<VaccineTypeb> selectAllVaccineTypeb() {
        return mapper.selectAllVaccineTypeb();
    }

    @Override
    public List<DiseaseType> selectDiseaseType() {
        return mapper.selectDiseaseType();
    }

    @Override
    public List<DiseaseType> selectDiseaseTypenv() {
        return mapper.selectDiseaseTypenv();
    }

    @Override
    public List<DiseaseType> selectDiseaseTypeA() {
        return mapper.selectDiseaseTypeA();
    }

    @Override
    public List<IntelligenceTypeb> selectIntelligenceTypeb() {
        return mapper.selectIntelligenceTypeb();
    }

    @Override
    public Integer addIntelligence(Intelligence intelligence) {
        return mapper.addIntelligence(intelligence);
    }

    @Override
    public List<Record> selectF(String fname, String fphone, Integer curPageNo, Integer pageSize) {
        return mapper.selectF(fname,fphone,(curPageNo - 1) * pageSize, pageSize);
    }

    @Override
    public int getCount(String fname, String fphone) {
        return mapper.getCount(fname,fphone);
    }


}
