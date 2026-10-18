package zhouqing.yourmcpserver.service;

import org.springframework.ai.mcp.annotation.McpTool;
import org.springframework.stereotype.Service;

@Service
public class CalculatorMcpToolService {

    @McpTool(description = "加法运算：计算两个整数a、b的和")
    public int add(int a, int b) {
        return a + b;
    }

    @McpTool(description = "减法运算：计算两个整数a、b的差")
    public int sub(int a, int b) {
        return a - b;
    }

    @McpTool(description = "乘法运算：计算两个整数a、b的乘积")
    public  int mult(int a, int b) {
        return a * b;
    }

    @McpTool(description = "除法运算：计算两个整数a、b的商")
    public int div(int a, int b) {
        return a / b;
    }
}
