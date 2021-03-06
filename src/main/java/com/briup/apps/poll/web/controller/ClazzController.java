package com.briup.apps.poll.web.controller;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.apps.poll.bean.Clazz;
import com.briup.apps.poll.bean.extend.ClazzVM;
import com.briup.apps.poll.service.IClazzService;
import com.briup.apps.poll.util.MsgResponse;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/Clazz")
public class ClazzController {

	@Autowired
	IClazzService clazzService;
	
	@ApiOperation(value="查询所有班级",notes="单表")
	@GetMapping("/findAllClazz")
	public MsgResponse findAllClazzs(){
		try {
			List<Clazz> list = clazzService.findAll();
			return MsgResponse.success("success", list);
		} catch (Exception e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}	

	}
	@GetMapping("/findAllClazzVM")
	public MsgResponse findAllClazzVM(){
		try {
			List<ClazzVM> list = clazzService.findAllClazzVM();
			return MsgResponse.success("success", list);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}	

	}

	@ApiOperation("通过id查找班级信息")
	@GetMapping("/finById")
	public MsgResponse findById(long id) {
		try {
			Clazz course = clazzService.findById(id);
			return MsgResponse.success("success",course);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@ApiOperation("添加或更新")
	@PostMapping("/add")
	public MsgResponse saveOrUpdate(Clazz course) {
		try {
			clazzService.saveOrUpdate(course);
			return MsgResponse.success("success", course);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@ApiOperation("模糊查询")
	@GetMapping("/query")
	public MsgResponse query(String keyWord) {
		try {
			List<Clazz> list = clazzService.query(keyWord);
			return MsgResponse.success("success", list);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@ApiOperation("根据id删除班级信息")
	@GetMapping("/delete")
	public MsgResponse deletById(long id) {
		try {
			clazzService.deleteById(id);
			return MsgResponse.success("success", "");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@ApiOperation("根据idList 批量删除班级信息")
	public MsgResponse batchDelete(String ids) {
		try {
			String[] idArray = ids.split("-");
			List<Long> idList = new LinkedList<>();
			for(String str:idArray) {
				idList.add(Long.valueOf(str));
			}
			clazzService.batchDelete(idList);
			return MsgResponse.success("success","");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
}
