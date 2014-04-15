package npp.homework.Threads;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;



public class MainClass {
	static public Queue<String> queueOfStrings = new LinkedList<String>();
	static public Queue<Integer> queueOfElements = new LinkedList<Integer>();
	static boolean readerIsAlive = false;
	static boolean calculatorIsAlive = false;
	/**
	 * @param args
	 * @throws IOException
	 */

	static class ReadingThread extends Thread {
		@Override
		public void run() {
			BufferedReader buffer = null;
			FileReader freader;
			readerIsAlive = true;
			try {
				freader = new FileReader("..\\ThreadsHomework\\input.txt");
				buffer = new BufferedReader(freader);
				String line;
				while ((line = buffer.readLine()) != null) {
					synchronized (queueOfStrings) {
						queueOfStrings.add(line);
					}		
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				try {
					buffer.close();
				} catch (IOException | NullPointerException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			readerIsAlive = false;
		}
	}

	static class CalculateThread extends Thread{

		@Override
		public void run() {
			String line;
			calculatorIsAlive = true;
			while(queueOfStrings.size()==0){
				yield();
			}
			while(queueOfStrings.size()>0){
				int sum = 0;
				
				synchronized (queueOfStrings) {
					line = queueOfStrings.poll();
				}
				
				for (String res : line.split(" ")) {
					sum += Integer.parseInt(res);
				}
			
				synchronized (queueOfElements) {
					 
					queueOfElements.add(sum);
				}
				
				while(queueOfStrings.size() == 0 && readerIsAlive){
					yield();
				}
			
			}
			calculatorIsAlive = false;
			System.out.println(queueOfElements.size() + "Calculation is done");
		}
	}
	
	static class WritingThread extends Thread{

		@Override
		public void run() {
			
			FileWriter fwriter;
			BufferedWriter wbuffer = null;
			try {
				fwriter = new FileWriter("..\\ThreadsHomework\\output.txt");
				wbuffer = new BufferedWriter(fwriter);
				
				while(queueOfElements.size() == 0){
					yield();
				}
				while(queueOfElements.size() > 0){

					synchronized (queueOfElements) {
						int temp = queueOfElements.poll();
						System.out.println(temp);
						wbuffer.write(temp + "");
						wbuffer.newLine();
					}
					
					while(queueOfElements.size() == 0 && calculatorIsAlive){
						yield();
					}
				}
				
			} catch (IOException | NullPointerException e ) {
				e.printStackTrace();
			} finally {
				try {
					wbuffer.close();
				} catch (IOException | NullPointerException e) {
					e.printStackTrace();
				}
			}
			 
		}
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Start");
		
		ReadingThread reader = new ReadingThread();
		
		CalculateThread calculate = new CalculateThread();
		
		
		WritingThread writer = new WritingThread();
		reader.start();
		calculate.start();
		writer.start();
		
	}

}
