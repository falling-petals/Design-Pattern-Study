package com.hzz.dp.behavioral.visitor;

import java.util.List;

public class VisitorDemo {
    public static void main(String[] args) {
        List<DocumentElement> elements = List.of(
            new Heading("设计模式学习", 1),
            new Paragraph("访问者模式是行为型模式中的一种。"),
            new Heading("核心思想", 2),
            new Paragraph("将操作与数据结构分离，新增操作时无须修改元素类。")
        );

        Document doc = new Document(elements);

        System.out.println("=== HTML 导出 ===");
        HtmlVisitor htmlVisitor = new HtmlVisitor();
        doc.accept(htmlVisitor);
        System.out.println(htmlVisitor.getResult());

        System.out.println("=== 纯文本导出 ===");
        TextVisitor textVisitor = new TextVisitor();
        doc.accept(textVisitor);
        System.out.println(textVisitor.getResult());
    }
}
