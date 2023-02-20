package _20_;

import java.sql.Blob;
import java.util.Date;

import lombok.Data;

@Data
public class _10_Boards {
	private int bno;
	private String btitle;
	private String bcontent;
	private String bwriter;
	private Date bdate;
	private String bfileName;
	private Blob bfileData;

}
