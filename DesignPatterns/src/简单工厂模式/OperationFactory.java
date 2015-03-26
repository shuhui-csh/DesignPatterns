/**
 * 
 */
package 简单工厂模式;

/**
 * @author CSH 2015-2-13下午2:10:41 简单工厂类，用于实例化各个子运算类，向上转型为父类Operation对象
 */
public class OperationFactory {
	public static Operation creatOperation(String operate) {
		Operation oper = null;
		switch (operate) {
		case "+":
			oper = new OperationAdd();
			break;
		case "-":
			oper = new OperationSub();
			break;
		case "*":
			oper = new OperationMul();
			break;
		case "/":
			oper = new OperationDiv();
			break; 
		}
		return oper;

	}
}
