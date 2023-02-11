/*
 * Copyright 2008 JRimum Project
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by
 * applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS
 * OF ANY KIND, either express or implied. See the License for the specific
 * language governing permissions and limitations under the License.
 * 
 * Created at: 03/08/2008 - 12:27:56
 * 
 * ================================================================================
 * 
 * Direitos autorais 2008 JRimum Project
 * 
 * Licenciado sob a Licença Apache, Versão 2.0 ("LICENÇA"); você não pode usar
 * esse arquivo exceto em conformidade com a esta LICENÇA. Você pode obter uma
 * cópia desta LICENÇA em http://www.apache.org/licenses/LICENSE-2.0 A menos que
 * haja exigência legal ou acordo por escrito, a distribuição de software sob
 * esta LICENÇA se dará “COMO ESTÁ”, SEM GARANTIAS OU CONDIÇÕES DE QUALQUER
 * TIPO, sejam expressas ou tácitas. Veja a LICENÇA para a redação específica a
 * reger permissões e limitações sob esta LICENÇA.
 * 
 * Criado em: 03/08/2008 - 12:27:56
 * 
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.0 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2008.08.03 at 12:27:56 AM GMT-03:00 
//

package org.jrimum.texgit.language;

import javax.xml.bind.annotation.XmlEnum;

/**
 * 
 * 
 * <p>
 * Formatos pr� definidos suportados pelo componente.
 * </p>
 * 
 * 
 * 
 * <p>
 * Java class for enumFormats.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name=&quot;enumFormats&quot;&gt;
 *   &lt;restriction base=&quot;{http://www.w3.org/2001/XMLSchema}string&quot;&gt;
 *     &lt;enumeration value=&quot;DATE_DDMMYY&quot;/&gt;
 *     &lt;enumeration value=&quot;DATE_DDMMYYYY&quot;/&gt;
 *     &lt;enumeration value=&quot;DATE_YYMMDD&quot;/&gt;
 *     &lt;enumeration value=&quot;DATE_YYYYMMDD&quot;/&gt;
 *     &lt;enumeration value=&quot;DECIMAL_D&quot;/&gt;
 *     &lt;enumeration value=&quot;DECIMAL_DD&quot;/&gt;
 *     &lt;enumeration value=&quot;DECIMAL_DDD&quot;/&gt;
 *     &lt;enumeration value=&quot;DECIMAL_DDDD&quot;/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlEnum
public enum EnumFormats {

	DATE_DDMMYY, DATE_DDMMYYYY, DATE_YYMMDD, DATE_YYYYMMDD, DECIMAL_D, DECIMAL_DD, DECIMAL_DDD, DECIMAL_DDDD;

	public String value() {
		return name();
	}

	public static EnumFormats fromValue(String v) {
		return valueOf(v);
	}

}
