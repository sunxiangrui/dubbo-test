package dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by Administrator on 2016/7/21 0021.
 */

public class Test {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"spring-*.xml"});
        context.start();

        try {
            System.in.read(); // Ϊ��֤����һֱ���ţ�������������������ģ��
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
