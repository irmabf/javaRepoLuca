package beans;

import java.util.Arrays;
import java.util.Date;

public class Exam {
	private Date date;
	private String content;
	private Subject subject;
	private Grade[] grades = new Grade[2];
	
	public Exam(){}
	
	public Exam(Subject subject){
		this.subject = subject;
	}
	
	public Exam(Date date, String content, Subject subject, Grade[] grades){
		this.date = date;
		this.content = content;
		this.subject = subject;
		this.grades = grades;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public Grade[] getGrades() {
		return grades;
	}

	public void setGrades(Grade[] grades) {
		this.grades = grades;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Exam [date=");
		builder.append(date);
		builder.append(", content=");
		builder.append(content);
		builder.append(", subject=");
		builder.append(subject);
		builder.append(", grades=");
		builder.append(Arrays.toString(grades));
		builder.append("]");
		return builder.toString();
	}
	
	public void generateContent(){
		content = "Here are your questions and answers";
	}
	
}

















