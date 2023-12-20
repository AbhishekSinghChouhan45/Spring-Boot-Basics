package com.nt.sbeans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
@Component("HH")
@PropertySource("application.properties")
public class HotelHighway {
	@Autowired
	private Test t;
	@Value("${menu.dosa.price}")
	private Integer dosa;
	@Value("${menu.vada.price}")
	private Integer vada;
	@Value("${menu.bonda.price}")
	private Integer bonda;
	@Value("${menu.idli.price}")
	private Integer idli;
	@Value("${menu.rasogulla.price}")
	private Integer rasogulla;
	@Value("${menu.gupchup.price}")
	private Integer gupchup;
	@Value("${menu.special.price}")
	private Integer special;
//	private Integer total = t.getTotal();
	@Override
	public String toString() {
		return "HotelHighway [dosa=" + dosa + ", vada=" + vada + ", bonda=" + bonda + ", idli=" + idli + ", rasogulla="
				+ rasogulla + ", gupchup=" + gupchup + ", special=" + special + ", t=" + t + ", total=" + "sa" + "]";
	}
	
	
	
}
