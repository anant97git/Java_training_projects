package com.springcore;

import org.springframework.stereotype.Component;

@Component("iopContainer")
public class IOP {
	
	Operation op;
	
	public int getOperationValue(Operation op, int a, int b)
	{
		return op.getOperationValue(a, b);
	}
	
//	public int getOperationValue(int val, int a, int b)
//	{
//		if (val == 1)
//		{
//			op = new AddOperation();
//			return op.getOperationValue(a, b);
//		}
//		else if (val == 2)
//		{
//			op = new MinusOperation();
//			return op.getOperationValue(a, b);
//		}
//		else if (val == 3)
//		{
//			op = new MultOperation();
//			return op.getOperationValue(a, b);
//		}
//		else if (val == 4)
//		{
//			op = new DivOperation();
//			return op.getOperationValue(a, b);
//		}
//		return 0;
//	}
}
