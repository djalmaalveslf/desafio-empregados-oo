package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Address;
import entities.Department;
import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nome do departamento: ");
		String departmentName = sc.nextLine();
		System.out.print("Dia do pagamento: ");
		int departmentPayDay = sc.nextInt();
		System.out.print("Email: ");
		sc.nextLine();
		String email = sc.nextLine();
		System.out.print("Telefone: ");
		String phone = sc.nextLine();
		
		Department department = new Department(departmentName, departmentPayDay, new Address(email, phone));
		
		System.out.print("Quantos funcionários tem o departamento? ");
		int num = sc.nextInt();
		
		for (int i = 1; i <= num; i++) {
			System.out.println("Dados do funcionário " + i + ":");
			System.out.print("Nome: ");
			sc.nextLine();
			String employeeName = sc.nextLine();
			System.out.print("Salário: ");
			double salary = sc.nextDouble();
			department.addEmployee(new Employee(employeeName, salary));
		}
		
		showReport(department);
		
		sc.close();
	}
	
	private static void showReport(Department department) {
		StringBuilder sb = new StringBuilder();
		sb.append("\nFOLHA DE PAGAMENTO:\n");
		sb.append("Departamento Vendas = " + String.format("%.2f", department.payroll()) + "\n");
		sb.append("Pagamento realizado no dia " + department.getPayDay() + "\n");
		sb.append("Funcionários:\n");
		for(Employee employees : department.getEmployees()) {
			sb.append(employees.getName() + "\n");
		}
		sb.append("Para dúvidas favor entrar em contato: " + department.getAddress().getEmail());
		
		System.out.println(sb);
	}

}
