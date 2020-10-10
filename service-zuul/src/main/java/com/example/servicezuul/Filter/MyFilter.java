package com.example.servicezuul.Filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import javax.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author komiles@163.com
 * @date 2020-10-10 18:25
 */
@Component
public class MyFilter extends ZuulFilter {

    private static Logger log = LoggerFactory.getLogger(MyFilter.class);

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext context = RequestContext.getCurrentContext();
        HttpServletRequest request = context.getRequest();

//        log.info(String.format("%s>>>>>%s",request.getMethod(),request.getRequestURL().toString()));
        log.info("{}->>>>{}",request.getMethod(),request.getRequestURL().toString());

        Object accessToken = request.getParameter("token");
        if(accessToken == null) {
            log.warn("token is empty");
            context.setSendZuulResponse(false);
            context.setResponseStatusCode(401);
            try{
                context.getResponse().getWriter().write("token is empty aa");
            }catch (Exception e){
                return null;
            }
        }
        log.info("OK");

        return null;
    }
}
