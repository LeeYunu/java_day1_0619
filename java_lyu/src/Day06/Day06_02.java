package Day06;

import java.util.Scanner;

public class Day06_02 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String [][] ȸ����� = new String[100][2];			
		
		while (true) {//while s
			
			System.out.println("=== ���� �޴�===");
			System.out.println("1.ȸ������ 2.�α��� 3.����"); int ���� = scanner.nextInt();
			
			if (���� == 1) {//if s
				// System.out.println(ȸ�����[0][0]); => null ���� ���� �׷��Ƿ� Null�� �����ؾ���
				System.out.println("--ȸ������--");
				System.out.println("-> ID: "); String ���̵� = scanner.next();
				int �ߺ�üũ = 0;
				for (int i=0; i<ȸ�����.length; i++) {//for2 s
					if (���̵� == ȸ�����[i][0]) {//if2 s
						System.err.println("�ߺ��� ���̵� �����մϴ�.");
						�ߺ�üũ = 1;
						break;
					}//if2 e
				}//for2 e
	
				if(�ߺ�üũ == 0) {//if3 s
				System.out.println("-> PW: "); String ��й�ȣ = scanner.next();				
					for ( int i =0; i<ȸ�����.length; i++) {//for3 s
						if (ȸ�����[i][0] == null) {
							ȸ�����[i][0] = ���̵�;
							ȸ�����[i][1]	= ��й�ȣ;							
						}
						System.err.println( "[ȸ������ �Ϸ�]");
						break;
					
					}//for3 e
				}//if3 e
			}//if e
			
		else if (���� == 2) {
			System.out.println("--�α��� ȭ��--");
			System.out.println("ID: "); String ���̵� = scanner.next();
			System.out.println("PW: "); String ��й�ȣ = scanner.next();
			
			int �α��ο��� =0;
			for ( int i=0; i<ȸ�����.length; i++) {	// for3 s
				if ( ȸ�����[i][0] !=null && ȸ�����[i][0].equals(���̵�) && ȸ�����[i][1].equals(��й�ȣ)) {//if 3 s
					System.err.println("[�α��� ����]");
					�α��ο��� = 1;
				
				
					
					while (true) {
						System.out.println("---------------------------- ");
						System.out.println("\t ���̵� \t ��й�ȣ");
							for ( int j =0; j<ȸ�����.length;j++) {//for4 s
								if (ȸ�����[j][0] !=null) {
									System.out.println("\t "+ ȸ�����[j][0] + "\t " + ȸ�����[j][1]);
									System.out.println("---------------------------- ");
								}
							}//for4 e
						
						System.out.println("1.ȸ��Ż�� 2.�н����庯�� 3.�α׾ƿ�"); int ����2 = scanner.nextInt();
						if (����2 == 3) {//if4 s
							System.err.println("[�α׾ƿ� �Ϸ�]");
							break;
						}//if4 e
						
						else if (����2 == 2) {//else ����2 s
							
							System.out.println("���ο� ��й�ȣ �Է�: "); String ��й�ȣ2 = scanner.next();
							ȸ����� [i][1] = ��й�ȣ2;
							System.out.println("�������� �����մϴ�");
							break;
						}//else ����2 2 e
						
						else if (����2 == 1) {
							ȸ�����[i][0]= null;
							ȸ�����[i][1]= null;
							
							//Ż���� ȸ���� �������� �ڿ��ִ� ȸ������ ��ĭ�� �̵�
							
							for (int h = i ; h<ȸ�����.length; h++) {//for5 s
								
								if(ȸ�����[h+1][0] !=null) {//if5 s
									ȸ����� [h][0] = ȸ�����[h+1][0];
									ȸ����� [h][1] = ȸ�����[h+1][1];
								}//if5 e
								else {//else s
									ȸ����� [h][0] = null;
									ȸ����� [h][1] = null;
									break;
								}//else5 e								
							}//for5 e
							System.err.println("[ȸ�� Ż��]");	
							break;
							
						}//else ����2 1 e
						
						else System.out.println("�Է°��� �ƴմϴ�.");
					}//while 2 e
					
				}// if 3 e
				else System.err.println("[�α��� ����]");
				break;
			} //for3 e
		} //else ���� 2 e
			
			
			else if (���� == 3) {
				System.err.println("����");
				break;
			}
			else {
				System.err.println("[������ �߸��Ǿ����ϴ�]");
			}
				
			
		}//while e
		
		
		
		
		
		
		
		
		
	} //m e
	
} // ce
