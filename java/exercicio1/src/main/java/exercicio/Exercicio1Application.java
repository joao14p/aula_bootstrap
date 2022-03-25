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
try(BufferedReader br1 = new BufferedReader(new FileReader(modelosCSV))){
				
				String line1 = br1.readLine();
				while (line1 != null) {
					
					String[] fields = line1.split(";");
					String modelo = fields[0];
					double consumoEtanol = Double.parseDouble(fields[1]);
					double consumoGasolina = Double.parseDouble(fields[2]);
					double capacidade = Double.parseDouble(fields[3]);
					
					list1.add(new Veiculos(modelo, consumoEtanol, consumoGasolina, capacidade));
					
					line1 = br1.readLine();
				}
			}
			System.out.println(list.toString());
			System.out.println(list1.toString());
			}
	
		catch(Exception e) {
			System.out.println("Erro ao ler o arquivo");
		}

}  
	
}

