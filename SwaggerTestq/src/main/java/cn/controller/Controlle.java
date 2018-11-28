package cn.controller;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Api(value="user")
@Controller
@ResponseBody
@RequestMapping(value="/user")
public class Controlle{

    @RequestMapping(value = "/getUser")
    @ResponseBody
    @ApiOperation(value="根据ID获取用户信息",httpMethod="GET",notes="get user by id")
    public String getUser(@ApiParam(required=true,value="用户ID",name="userId")@RequestParam(value="userId")Integer userId) {
        return "啦啦啦";
    }
}


/*
import cn.pojo.Userinfo;
import cn.service.UserServiceimpl;
import com.wordnik.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.websocket.server.PathParam;
import java.util.List;

@Api(value = "用户中心", description="用户中心")
@Controller
@RequestMapping(value = "/user")
public class Controlle {

    @Autowired
    private UserServiceimpl u;
    public UserServiceimpl getU() {
        return u;
    }
    public void setU(UserServiceimpl u) {
        this.u = u;
    }


    @ResponseBody
    @RequestMapping(value = "/getUser")
    @ApiOperation(value = "根据ID获取用户信息",httpMethod="GET",notes="get user by id")
    @ApiImplicitParams({
            @ApiImplicitParam(required = true, value = "用户对象", name = "uu", dataType="Userinfo", paramType="Userinfo"),
            @ApiImplicitParam(required = true, value = "当前页数", name = "index", dataType="int"),
            @ApiImplicitParam(required = true, value = "显示行数", name = "pagesize", dataType="int")})
    public List<Userinfo> getUser( @PathParam("uu") Userinfo uu,@PathParam("index") int index, @PathParam("pagesize") int pagesize) {
        return u.selser(uu, index, pagesize);
    }
}
*/

/*    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    @ApiOperation(notes = "新增用户", httpMethod = "POST", value = "添加一个用户")
    @ApiResponses(value = {@ApiResponse(code = 405, message = "invalid input")})
    @ResponseBody
    public boolean addUser(@ApiParam(required = true, value = "group data") @RequestBody User user) {
        return u.insert(user);

    }

    @RequestMapping(value = "/updateUser", method = RequestMethod.POST)
    @ApiOperation(notes = "更新用户", httpMethod = "POST", value = "更新一个用户")
    @ApiResponses(value = {@ApiResponse(code = 405, message = "invalid input")})
    @ResponseBody
    public boolean updateUser(@ApiParam(required = true, value = "用户信息") @RequestBody User user) {
        return u.updateById(user);
    }

    @RequestMapping(value = "/getUser", method = RequestMethod.POST)
    @ApiOperation(notes = "获取用户", httpMethod = "POST", value = "获取一个用户")
    @ApiResponses(value = {@ApiResponse(code = 405, message = "invalid input")})
    @ResponseBody
    public User updateUser(@ApiParam(required = true, value = "用户信息") @RequestBody Integer id) {
        return u.selectById(id);
    }
}*/
