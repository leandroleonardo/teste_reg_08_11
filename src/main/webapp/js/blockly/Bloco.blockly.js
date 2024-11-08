window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.Bloco = window.blockly.js.blockly.Bloco || {};

/**
 * @function Executar
 *
 *
 *
 * @param x
 * @param y
 *
 * @author Leandro Leonardo Assarice
 * @since 08/11/2024, 15:18:28
 *
 */
window.blockly.js.blockly.Bloco.ExecutarArgs = [{ description: 'x', id: '13d083a5' }, { description: 'y', id: '34bb36be' }];
window.blockly.js.blockly.Bloco.Executar = async function(x, y) {

  //
  this.cronapi.screen.changeValueOfField("vars.resp", (x + y));
}
