package chapter05.modifier;

public class SingletonMain {

		public static void main(String[] args) {
			
			Singleton s = null;
			// s= new Singleton(); // private 상태 -> 보이지 않음 
			
			s= Singleton.getInstance();
			
			
		}

}
