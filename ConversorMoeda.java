import javax.swing.JOptionPane;

public class ConversorMoeda {

	public static void main(String[] args) {
	
	double reais;
	int converter;
	 
	reais = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor em reais: "));
	
	converter = Integer.parseInt( JOptionPane.showInputDialog(null, "Escolha a moeda que deseja converter\n"+"1 - Dólar\n"+"2 - Euro\n"+"3 - Iene"));
	
	if (converter == 1) {
		double  dolar = reais / 5.44;
		JOptionPane.showMessageDialog(null, "O valor em Dólar é: "+ String.format("%.2f" , dolar));
	}else if (converter == 2) {
		double  euro = reais / 6.09;
		JOptionPane.showMessageDialog(null, "O valor em Euro é: "+ String.format("%.2f" , euro));
	}else if (converter == 3) {
		double  iene = reais / 26.57 ;
		JOptionPane.showMessageDialog(null, "O valor em Iene é: "+ String.format("%.2f" , iene ));
	
	
	
	}else {
		JOptionPane.showMessageDialog(null, "Opção inválida");
	}
	
	
	}

}
