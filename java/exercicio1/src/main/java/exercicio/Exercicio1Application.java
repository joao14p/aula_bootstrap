package exercicio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import exercicio.entity.Veiculos;

@SpringBootApplication
public class Exercicio1Application {
	

	public static void main(String[] args) throws FileNotFoundException {
		SpringApplication.run(Exercicio1Application.class, args);
	
		List<Veiculos> list = new ArrayList<>();
		List<Veiculos> list1 = new ArrayList<>();
	
		
		File veiculosCSV = new File("C:\\Users\\joaop\\Documents\\ws-sts\\exercicio1\\veiculos.csv");
		File modelosCSV = new File("C:\\Users\\joaop\\Documents\\ws-sts\\exercicio1\\modelos.csv");

try(BufferedReader br = new BufferedReader(new FileReader(veiculosCSV))){
			
			String line = br.readLine();
			while (line != null) {
				
				String[] fields = line.split(";");
				String modelo = fields[0];
				String placa = fields[1];
				
				list.add(new Veiculos(modelo, placa ));
				
				line = br.readLine();
			 }
			}catch(Exception e) {
				System.out.println("Erro ao ler o arquivo");
			}

	
		catch(Exception e) {
			System.out.println("Erro ao ler o arquivo");
		}

}  
	
}

