package stacksAndQueues;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BalancedBracketsTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void isBalancedtest() {
		assertEquals("NO", BalancedBrackets.isBalanced("[)"));
		assertEquals("YES", BalancedBrackets.isBalanced("{[()]}"));
		assertEquals("NO", BalancedBrackets.isBalanced("{[(])}"));
		assertEquals("YES", BalancedBrackets.isBalanced("{{[[(())]]}}"));
		
//		{(([])[])[]}
//		{(([])[])[]]}
//		{(([])[])[]}[]
		
		assertEquals("YES", BalancedBrackets.isBalanced("{(([])[])[]}"));
		assertEquals("NO", BalancedBrackets.isBalanced("{(([])[])[]]}"));
		assertEquals("YES", BalancedBrackets.isBalanced("{(([])[])[]}[]"));
		
	}
	
	@Test
	public void hackerRankTestCase0_Test(){
//			}][}}(}][))]
//			[](){()}
//			()
//			({}([][]))[]()
//			{)[](}]}]}))}(())(
//			([[)
		
		assertEquals("NO", BalancedBrackets.isBalanced("}][}}(}][))]"));
		assertEquals("YES", BalancedBrackets.isBalanced("[](){()}"));
		assertEquals("YES", BalancedBrackets.isBalanced("()"));
		assertEquals("YES", BalancedBrackets.isBalanced("({}([][]))[]()"));
		assertEquals("NO", BalancedBrackets.isBalanced("{)[](}]}]}))}(())("));
		assertEquals("NO", BalancedBrackets.isBalanced("([[)"));
				
	}

	@Test
	public void hackerRankTestCase5_Test() {
		//[{
			
			assertEquals("NO", BalancedBrackets.isBalanced("[{"));
	}
	
//	()[{}()]([[][]()[[]]]{()})([]()){[]{}}{{}}{}(){([[{}([]{})]])}
//	{][({(}]][[[{}]][[[())}[)(]([[[)][[))[}[]][()}))](]){}}})}[{]{}{((}]}{{)[{[){{)[]]}))]()]})))[
//	[)](][[([]))[)
//	]}]){[{{){
//	{[(}{)]]){(}}(][{{)]{[(((}{}{)}[({[}[}((}{()}[]})]}]]))((]][[{{}[(}})[){()}}{(}{{({{}[[]})]{((]{[){[
//	()}}[(}])][{]{()([}[}{}[{[]{]](]][[))(()[}(}{[{}[[]([{](]{}{[){()[{[{}}{[{()(()({}([[}[}[{(]})
//	){[])[](){[)}[)]}]]){](]()]({{)(]])(]{(}(}{)}])){[{}((){[({(()[[}](]})]}({)}{)]{{{
//	[(})])}{}}]{({[]]]))]})]
//	[{
//	{}([{()[]{{}}}])({})
//	{({}{[({({})([[]])}({}))({})]})}
//	()[]
//	{)[])}]){){]}[(({[)[{{[((]{()[]}][([(]}{](])()(}{(]}{})[)))[](){({)][}()((
//	[][(([{}])){}]{}[()]{([[{[()]({}[])()()}[{}][]]])}
//	(}]}
//	(([{()}]))[({[{}{}[]]{}})]{((){}{()}){{}}}{}{{[{[][]([])}[()({}())()({[]}{{[[]]([])}})()]]}}
//	[(([){[](}){){]]}{}([](([[)}[)})[(()[]){})}}]][({[}])}{(({}}{{{{])({]]}[[{{(}}][{)([)]}}
//	()()[()([{[()][]{}(){()({[]}[(((){(())}))]()){}}}])]
//	({)}]}[}]{({))}{)]()(](])})][(]{}{({{}[]{][)){}{}))]()}((][{]{]{][{}[)}}{)()][{[{{[[
//	)}(()[])(}]{{{}[)([})]()}()]}(][}{){}}})}({](){([()({{(){{
//	}([]]][[){}}[[)}[(}(}]{(}[{}][{}](}]}))]{][[}(({(]}[]{[{){{(}}[){[][{[]{[}}[)]}}]{}}(}
}
