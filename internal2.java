import java.io.*;
 class FileTwo
{
	public static void main(String args[]) throws IOException
	{
		File fin = new File("supermarket.csv");
		FileReader fr = new FileReader(fin);
		BufferedReader br = new BufferedReader(fr);
		int totalrev=0;
		String s;
		int i=0;
		String id[] = new String[3];
		int qn[] = new int[3];
		br.readLine();
		while((s=br.readLine())!=null)
		{
			String k[] = s.split(",");
			id[i] = k[1];
			System.out.println(s);
			int c;
			c = Integer.parseInt(k[2]);
			int q;
			q = Integer.parseInt(k[3]);
			qn[i] = q;
			totalrev+=c*q;
			i++; 
		}
		System.out.println("Total Revenue : " + totalrev);
		for(int k=0;k<qn.length;k++)
		{
			for(int j=k+1;j<qn.length;j++)
			{
				if(qn[k]>qn[j])
				{
					int temp = qn[j];
					qn[j] = qn[k];
					qn[k] = temp;

					String temp2 = id[j];
					id[j] = id[k];
					id[k] = temp2;
				}
			}
		}
		System.out.println("The items after sorting according tp demand");
		for(int p = 0;p<qn.length;p++)
			System.out.println(id[p] + ":" + qn[p]);
	}
}