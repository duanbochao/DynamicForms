package com.controller;

import com.bean.ModelData;
import com.bean.Select.Options;
import com.bean.Select.Select;
import com.bean.Table;
import com.bean.button.Button;
import com.bean.button.Emit;
import com.bean.input.Col;
import com.bean.input.Input;
import com.bean.input.Props;
import com.bean.input.Validate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
public class TestController {


  @RequestMapping("/list")
  public List<Object> get(){
    Input input = new Input(1,"商品名称","goods_name","iphone 7",24);
    Button button = new Button(2,"btn1","添加");
    HashMap<String, Object> map = new HashMap<>();
    ArrayList<Object> list = new ArrayList<>();
    list.add(button);
    list.add(input);
    return list;
  }

  @RequestMapping("/get")
  public  List<Object> test(){
    ModelData m1 = new ModelData("形成时间","xcsj","文本型");
    ModelData m2 = new ModelData("题名","ztm","文本型");
    ModelData m3 = new ModelData("产品分类","ztm","下拉框");
    ModelData m4 = new ModelData("产品分类2","ztm2","字典类型");
    ArrayList<ModelData> list = new ArrayList<>();
    list.add(m1);
    list.add(m2);
    list.add(m3);
    list.add(m4);


    ArrayList<Object> listForm = new ArrayList<>();
    for (ModelData data : list) {
      String type = data.getType();
      if (type.equals("文本型")){
        Input input = new Input(1,data.getNameZh(),data.getName(),"iphone 7",24,"请输入形成时间");
        listForm.add(input);
      }

      if (type.equals("下拉框")){
        List<String> value = new ArrayList<>();
        value.add("104");
        value.add("105");

        Options opt1 = new Options("104","生态蔬菜");
        Options opt2 = new Options("104","生态蔬菜");

        List<Options> options = new ArrayList<>();
        options.add(opt1);
        options.add(opt2);
        Select select = new Select(data.getNameZh(),data.getName(),12,value,options);
        listForm.add(select);
      }

      if (type.equals("字典类型")){
        List<String> value = new ArrayList<>();
        value.add("104");
        value.add("105");

        Options opt1 = new Options("104","生态蔬菜");
        Options opt2 = new Options("104","生态蔬菜");

        List<Options> options = new ArrayList<>();
        options.add(opt1);
        options.add(opt2);
        Select select = new Select(data.getNameZh(),data.getName(),10,value,options);
        Button button = new Button(2,data.getNameZh(),"添加");
        listForm.add(select);
        listForm.add(button);
      }


    }

    return listForm;
  }



  @RequestMapping("/form")
  public List<Object> getForm(){

    ArrayList<Table> list = new ArrayList<>();

    //需要校验的input
    Table t1 = new Table("xcsj","形成时间","文本类型",8,true,true,true,true,"",false,12);
    //不需要校验的input
    Table t2 = new Table("wjbh","文件编号","文本类型",8,false,true,true,true,"",false,12);

    //需要校验的select
    Table t3 = new Table("jjcd","紧急程度","选择框类型",8,false,true,true,true,"字典信息",false,12);

    Table t4 = new Table("jb","级别","选择框类型",8,false,true,true,true,"",false,24);

    list.add(t1);
    list.add(t2);
    list.add(t3);
    list.add(t4);

    ArrayList<Object> listForm = new ArrayList<>();

    for (Table o : list) {

          //处理文本类型
          if (o.getType().equals("文本类型")){
            Col col = new Col();
            col.setSpan(o.getSpan());
            Props props = new Props();
            props.setSize("mini");
            props.setMaxlength(o.getLength());

            //设置通用方式
            Input input = new Input();
            input.setType("el-input");
            input.setField(o.getName());
            input.setTitle(o.getNameZh());
            input.setProps(props);
            input.setCol(col);

            // 是否锁定
            if (o.isLockLength()){
              ArrayList<Validate> vaList = new ArrayList<>();
              Validate validate = new Validate();
              validate.setRequired(true);
              validate.setMessage("请输入"+o.getNameZh());
              validate.setTrigger("blur");
              vaList.add(validate);
              input.setValidate(vaList);
            }
            listForm.add(input);
          }


          //处理选择框类型
          if (o.getType().equals("选择框类型")){

            //设置通用方式
            com.bean.Select.Props props = new com.bean.Select.Props();
            com.bean.Select.Col col = new com.bean.Select.Col();
            col.setSpan(o.getSpan());
            props.setSize("mini");
            props.setSetMaxlength(o.getLength());

            Select select = new Select();
            select.setType("select");
            select.setTitle(o.getNameZh());
            select.setField(o.getName());
            select.setCol(col);
            select.setProps(props);

            //处理字典类型的选择框,带按钮
            if (!o.getDiction().equals("")){
              com.bean.button.Col bc = new com.bean.button.Col();
              bc.setSpan(24-o.getSpan());
              Emit emit = new Emit();
              emit.setName("click");
              ArrayList<String> a = new ArrayList<>();
              a.add(o.getName());
              emit.setInject(a);
              ArrayList<Emit> b = new ArrayList<>();
              b.add(emit);
              Button button = new Button();
              button.setEmit(b);
              button.setType("el-button");
              button.setEmitPrefix("prefix1");
              button.setCol(bc);
              listForm.add(select);
              listForm.add(button);
            }else {
              listForm.add(select);
            }

          }
    }
      return listForm;
  }
}
