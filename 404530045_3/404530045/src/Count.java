/**
 * GradeAnalyzer
 * @author ³Å¥õ²Ð
 *
 */
public class Count {
	/**
	 * Count the number for each level.  
	 */
	String level;
	int count;
	
	public Count(String olevel,int ocount)
	{
		this.level=olevel;
		this.count=ocount;
	}
	public String toString()
	{
		return this.level+":"+this.count+"\n";
	}
	

}
