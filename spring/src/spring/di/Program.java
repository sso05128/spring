package spring.di;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.entity.Exam;
import spring.di.entity.NewlecExam;
import spring.di.ui.ExamConsole;

public class Program {
	public static void main(String[] args) {
		/*���������� �����ϴ� ������� �ڵ� ����
		Exam exam = new NewlecExam();
		//ExamConsole console = new InlineExamConsole(exam);  //DI
		ExamConsole console = new GridExamConsole(exam); // �� ��ǰ�� �ٲٴ� ���� spring�� �������� �� �� �ִ�.
		
		console.setExam(exam); //set�� �̿��� ��ǰ ����
		*/
//		
		ApplicationContext context = 
				new AnnotationConfigApplicationContext(NewlecDIConfig.class);
		
		ExamConsole console = (ExamConsole) context.getBean("console");
		//ExamConsole console = context.getBean(ExamConsole.class);
		console.print();
		
		//List<Exam> exams = (List<Exam>)context.getBean("exams");
		//exams.add(new NewlecExam(1,1,1,1));
		
		/*for(Exam e : exams) {
			System.out.println(e);
		}
		*/
	}
}
