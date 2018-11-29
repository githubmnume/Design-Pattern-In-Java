package structural.adapter;

import static org.junit.Assert.assertTrue;

import java.util.Optional;

import org.junit.Test;

import structural.adapter.classAdapter.VoltageAdapterExtends;
import structural.adapter.instanceAdapter.VoltageAdapterImplements;

public class APP {

	public static void main(String[] args) {
	/*	//中国电器
		ChinesEelectricity chinesEelectricity=new ChinesEelectricity();
		
		//变压器
		VoltageAdapter voltageAdapter=new VoltageAdapter();
		//电器接入变压器
		chinesEelectricity.setVoltage220v(voltageAdapter);
		
		//变压器转换美国电压
		voltageAdapter.setVoltage110V(new AmericanVoltage());
		//工作
		chinesEelectricity.work();*/
		
			//中国电器
		ChinesEelectricity chinesEelectricity=new ChinesEelectricity();
		
		//变压器
		/*
		 * 耦合比较严重，修改比较麻烦（比如换英国电压，就需要重新写一个适配器）
		 */
		VoltageAdapterExtends voltageAdapter=new VoltageAdapterExtends();
		//电器接入变压器
		chinesEelectricity.setVoltage220v(voltageAdapter);
		//工作
		chinesEelectricity.work();
		
		
		//中国电器
		/*ChinesEelectricity chinesEelectricity=new ChinesEelectricity();
		
		//变压器
		VoltageAdapterImplements voltageAdapter=new VoltageAdapterImplements();
		
		//接入电流
		voltageAdapter.setVoltage110V(new EnglandVoltage());
		voltageAdapter.setVoltage110V(new AmericanVoltage());
		
		//电器接入变压器
		chinesEelectricity.setVoltage220v(voltageAdapter);
		
		//工作
		chinesEelectricity.work();
		 */
		
		
		
	}

	@Test
	public void testClassAdapter() {
	//中国电器
	ChinesEelectricity chinesEelectricity=new ChinesEelectricity();
	
	//变压器
	/*
	 * 耦合比较严重，修改比较麻烦（比如换英国电压，就需要重新写一个适配器）
	 */
	VoltageAdapterExtends voltageAdapter=new VoltageAdapterExtends();
	//电器接入变压器
	chinesEelectricity.setVoltage220v(voltageAdapter);
	//工作
	chinesEelectricity.work();
//	assertTrue(!Optional.ofNullable(chinesEelectricity.getVoltage220v()).isPresent());
	}
}
