package Tema5_6;

public class Data {
	
	private int dia;
	private int mes;
	private int any;
	
	public Data() {
		
	}
	
	public Data (int dia,int mes,int any) {
		
		boolean anyvalid = false ;
		boolean	diavalid= false; 
		boolean mesvalid=false;
		boolean	bisiesto=false;

		if (any > 0) {

			if((any % 4 == 0 && any % 100 != 0) || any % 400 == 0) {

					anyvalid = true;

					bisiesto = true;

			}	if((any % 4 != 0 && any % 100 == 0) || any % 400 != 0) {

						anyvalid = true;

				}		

		}else {

			anyvalid=false;

		}		

		if (dia > 0 && dia <= 31) {

			if((mes == 4 || mes == 6 || mes == 9 || mes == 11) && (dia <=30 && dia > 0) ) {

				diavalid = true;

			}

			if((mes == 1 || mes == 3 || mes == 5  || mes == 7 || mes == 8 || mes == 10 || mes == 12) && (dia <=31 && dia > 0)) {

				diavalid = true;

			}

			if(mes == 2 && bisiesto && dia < 30) {

				diavalid = true;

			}

			if(mes == 2 && bisiesto == false && dia < 29) {

				diavalid = true;

			}			

		}else {

			diavalid=false;

		}
		
		if(mes > 0 && mes <= 12) {



			mesvalid = true;


		}else {

			mesvalid = false;

		}
		if (diavalid == true && anyvalid == true && mesvalid==true) {
			this.dia = dia;
			this.mes = mes;
			this.any = any;
			System.out.println("Data valida");
			dema();
		}
		if (diavalid == false || anyvalid == false || mesvalid==false) {
			System.out.println("Data no valida");
			
		}
		
	}

public  void dema() {
		//31 de desembre
		if ( this.dia == 31 && this.mes == 12 ) {
			this.dia=1;
			this.mes=1;
			this.any=any + 1;
		//mesos de 31 dies darrer dia de mes
		}else if (this.dia == 31 && (this.mes ==1 || this.mes ==3 || this.mes ==5 ||this.mes ==7 || this.mes ==8 || this.mes ==10)){
			this.dia=1;
			this.mes= mes + 1;
			//mesos 30 dies darrer dia de mes
		}else if (this.dia == 30 && ( this.mes ==4 || this.mes ==6 ||this.mes ==9 || this.mes ==11)) {
			this.dia=1;
			this.mes=mes + 1;
			//darrer dia de febrer
		} else if (this.dia == 28 && this.mes == 2) {
			this.dia=1;
			this.mes=mes + 1;
			//dia 29 de febres, en anys vicests
		}else if (this.dia == 29 && this.mes == 2) {
			this.dia=1;
			this.mes=mes + 1;
			// dia entre 1 a 30 dels mesos de 31 dies
		} else if (this.dia > 0 && this.dia <=30 && (this.mes ==1 || this.mes ==3 || this.mes ==5 ||this.mes ==7 || this.mes ==8 || this.mes ==10)) {
			dia=dia + 1;
			// dia entre 1 a 29 dels mesos de 30 dies
		} else if (this.dia > 0 && (this.dia <=29 && ( this.mes ==4 || this.mes ==6 ||this.mes ==9 || this.mes==11))) {
			this.dia= dia + 1;
			//dia entre 1 a 27 en el mes de febrer
		} else if (this.dia < 0 && this.dia >= 27 ) {
			this.dia= dia + 1;
			//die entre 1 i 28 en febrer en any vicest
		}else if (this.dia< 0 && this.dia>=28 && (this.any % 4 == 0 && this.any % 100 != 0) || this.any % 400 == 0) {
			this.dia= dia + 1;
		}
		System.out.println("El dia seguent es : " + this.dia+ "/" + this.mes + "/" + this.any);
		
		
	}
	public int getDia() {
		return dia;
	}

	public int getMes() {
		return mes;
	}

	public int getAny() {
		return any;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public void setAny(int any) {
		this.any = any;
	}
	
	
	
	
	
}
