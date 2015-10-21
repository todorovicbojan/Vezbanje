
public class Student {
	
		
		private int indeks;
		private String ime;
		private String prezime;
		private long jmbg;
		private String smer;
		private String fakultet;
		private byte godinaStudija;
		private short godinaUpisa;
		private float prosek;
		private byte brojIspita;
		private boolean pol;
		
		
		public Student() {
			indeks = 0;
			ime = "";
			prezime = "";
			jmbg = 0;
			smer = "";
			fakultet = "Ekonomski";
			godinaStudija = 1;
			godinaUpisa = 2015;
			prosek = 5.00f;
			pol = true;
		}
		
		
		public Student(int indeks, String ime, String prezime, long jmbg) {
			this();
			setIndeks(indeks);
			this.ime = ime;
			this.prezime = prezime;
			setJmbg(jmbg);
		}
		
		public Student(String ime, String prezime, long jmbg) {
			this(0, ime, prezime, 0);
		}
		
		public void stampaj() {

			System.out.println( this.ime + " " + prezime + " -> " + indeks + jmbg);
			System.out.println("=====================");
		}
			
		public int getIndeks() {
			return indeks;
		}

		private void setIndeks(int indeks) {
			if ( indeks < 0 )
				indeks = 0;
			this.indeks = indeks;
		}


		public String getIme() {
			return ime;
		}


		public void setIme(String ime) {
			this.ime = ime;
		}


		public String getPrezime() {
			return prezime;
		}


		public void setPrezime(String prezime) {
			this.prezime = prezime;
		}


		public long getJmbg() {
			return jmbg;
		}


		public void setJmbg(long jmbg) {
			this.jmbg = jmbg;
		}


		public String getSmer() {
			return smer;
		}


		public void setSmer(String smer) {
			this.smer = smer;
		}


		public String getFakultet() {
			return fakultet;
		}


		public void setFakultet(String fakultet) {
			this.fakultet = fakultet;
		}


		public byte getGodinaStudija() {
			return godinaStudija;
		}


		public void setGodinaStudija(byte godinaStudija) {
			this.godinaStudija = godinaStudija;
		}


		public short getGodinaUpisa() {
			return godinaUpisa;
		}


		public void setGodinaUpisa(short godinaUpisa) {
			this.godinaUpisa = godinaUpisa;
		}


		public float getProsek() {
			return prosek;
		}


		public void setProsek(float prosek) {
			this.prosek = prosek;
		}


		public byte getBrojIspita() {
			return brojIspita;
		}


		public void setBrojIspita(byte brojIspita) {
			this.brojIspita = brojIspita;
		}

		public String getPol() {
			if ( pol )
				return "muski";
			else
				return "zenski";
		}

		public void setPol(boolean pol) {
			this.pol = pol;
		}
		
	}

