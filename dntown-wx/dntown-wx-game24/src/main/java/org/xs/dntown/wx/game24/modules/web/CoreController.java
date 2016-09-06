package org.xs.dntown.wx.game24.modules.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.xs.dntown.wx.game24.common.web.BaseController;

/**
 * 核心Controller
 */
@Controller(value = "game24CoreController")
@RequestMapping("game24")
public class CoreController extends BaseController {

	/**
	 * test
	 */
	@ResponseBody
	@RequestMapping(value = "", produces = { "text/plain;charset=utf-8" })
	public String top(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		return "hello world game24";
	}
}