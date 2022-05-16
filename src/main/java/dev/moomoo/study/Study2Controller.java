package dev.moomoo.study;

import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/study2")
public class Study2Controller {

    /*
     * @GetMapping("/example1")
     * public StudyVO example1(HttpServletRequest request) {
     * 
     * StudyVO stVo = new StudyVO();
     * stVo.setA(request.getParameter("a"));
     * stVo.setB(request.getParameter("b"));
     * 
     * return stVo;
     * }
     */

    @GetMapping("/example1")
    public StudyVO example1(@RequestParam("a") String a, @RequestParam("b") String b) {

        StudyVO stVO = new StudyVO();
        stVO.setA(a);
        stVO.setB(b);

        return stVO;
    }

    @PostMapping("/example2")
    public StudyVO example2(@RequestBody() StudyVO paramVO) {

        StudyVO stVO = new StudyVO();
        stVO.setA(paramVO.getA());
        stVO.setB(paramVO.getB());

        return stVO;
    }

    @PostMapping("example3/{a}")
    public StudyVO example3(@PathVariable("a") String a, @RequestParam("b") String b, @RequestParam("c") String c) {
        // public StudyVO example3(@PathVariable("a") String a, @ModelAttribute StudyVO
        // paramVO) {

        StudyVO stVO = new StudyVO();
        stVO.setA(a);
        stVO.setB(b);
        stVO.setC(c);
        // stVO.setB(paramVO.getB());
        // stVO.setC(paramVO.getC());

        return stVO;
    }

    @PostMapping("/example4")
    public StudyVO example4(@RequestHeader("Header-A") String a, @RequestHeader("Header-B") String b,
            @RequestHeader("Header-C") String c) {

        StudyVO stVO = new StudyVO();
        stVO.setA(a);
        stVO.setB(b);
        stVO.setC(c);

        return stVO;
    }

}