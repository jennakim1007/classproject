package MiniGames;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class concentrationGame2 {

   public static int life = 3;
   public static int score = 0;
   
   public enum STATE{
      IDLE,
      RESET,
      PLAY,
      GAMEOVER,
      EXIT
   }
   
   public static STATE state = STATE.IDLE;
   
   static Scanner sc = new Scanner(System.in);
   
   static Random ran = new Random();
   static int ranNum = 0;
   static int crtNum = 0;
   
   public static void main(String[] args) {
      
      while(state != STATE.EXIT) {
      
      switch (state) {
      case IDLE:
         GamePrint();
         break;
      case RESET:
         ResetGame();
         break;
      case PLAY:
         PlayGame();
         break;
      case GAMEOVER:
         GameOver();
         break;
      case EXIT:
         //Exit();
         break;
      }
      
      
      }
      //System.out.println(state);
   }
   
   public static void GamePrint() {
      System.out.println("랜덤 숫자 맞추기 게임");
      System.out.println("----------------------");
      System.out.println("1부터 100까지 랜덤으로 생성되는 숫자를 맞춰보세요");
      
      state = STATE.RESET;

   }
   
   static void ResetGame() {
      System.out.println("----------------------");
      
      life = 3;
      // score = 0;
      
      ranNum = ran.nextInt(0,100) + 1;
      
      System.out.println("ran " + ranNum);
      
      state = STATE.PLAY;
      
   }
   
   static void PlayGame() {
      while(life > 0) {
         crtNum = sc.nextInt();
         
         if(crtNum < ranNum) {
            System.out.println("up");
            life--;
         }
         else if(crtNum > ranNum) {
            System.out.println("down");
            life--;
         }
         else if(crtNum == ranNum) {
            System.out.println("정답");
            
            score += 10;
            // getScore();
            System.out.println(score);
            state = STATE.GAMEOVER;
            break;
         }
         
         if(life == 0) {
            System.out.println("실패");
            state = STATE.GAMEOVER;
         }
         
         System.out.println("남은 라이프 : " + life);
         
         
      }
   }
   
   static void GameOver() {
      System.out.println("다시 플레이 ? 0 : 예 1 : 아니오");
      int r = sc.nextInt();
      if(r == 0) {
         state = STATE.RESET;
      }
      else if(r == 1){
    	  System.out.println("최종 점수 : " + score);
         Exit();
         state = STATE.EXIT;
      }
   }
   
   static void Exit() {

      System.out.println("점수 : " + score);
      System.out.println("GAME OVER");
   }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
}