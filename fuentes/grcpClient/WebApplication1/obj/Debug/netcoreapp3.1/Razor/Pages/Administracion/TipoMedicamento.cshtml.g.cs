#pragma checksum "C:\Users\Mati\source\repos\DSSD-TP1\fuentes\grcpClient\WebApplication1\Pages\Administracion\TipoMedicamento.cshtml" "{ff1816ec-aa5e-4d10-87f7-6f4963833460}" "44c0f3c28dc4f92d6c3e686444cb1c710bb716bf"
// <auto-generated/>
#pragma warning disable 1591
[assembly: global::Microsoft.AspNetCore.Razor.Hosting.RazorCompiledItemAttribute(typeof(WebApplication1.Pages.Administracion.Pages_Administracion_TipoMedicamento), @"mvc.1.0.razor-page", @"/Pages/Administracion/TipoMedicamento.cshtml")]
namespace WebApplication1.Pages.Administracion
{
    #line hidden
    using System;
    using System.Collections.Generic;
    using System.Linq;
    using System.Threading.Tasks;
    using Microsoft.AspNetCore.Mvc;
    using Microsoft.AspNetCore.Mvc.Rendering;
    using Microsoft.AspNetCore.Mvc.ViewFeatures;
#nullable restore
#line 1 "C:\Users\Mati\source\repos\DSSD-TP1\fuentes\grcpClient\WebApplication1\Pages\_ViewImports.cshtml"
using WebApplication1;

#line default
#line hidden
#nullable disable
    [global::Microsoft.AspNetCore.Razor.Hosting.RazorSourceChecksumAttribute(@"SHA1", @"44c0f3c28dc4f92d6c3e686444cb1c710bb716bf", @"/Pages/Administracion/TipoMedicamento.cshtml")]
    [global::Microsoft.AspNetCore.Razor.Hosting.RazorSourceChecksumAttribute(@"SHA1", @"cd66e6c0b2d0593b97c0d67f6f506054866fe040", @"/Pages/_ViewImports.cshtml")]
    public class Pages_Administracion_TipoMedicamento : global::Microsoft.AspNetCore.Mvc.RazorPages.Page
    {
        #pragma warning disable 1998
        public async override global::System.Threading.Tasks.Task ExecuteAsync()
        {
            WriteLiteral(@"<main role=""main"" class="" "">
    <div class=""container my-4"">
        <div class=""row"">
            <div class=""col mb-4"">
                <a href=""AltaTipoMedicamento"" class=""btn btn-success"">
                    <i class=""fas fa-plus-circle me-1""></i>Nuevo
                </a>
            </div>
        </div>
        <table class=""table"">
            <thead>
                <tr>
                    <th scope=""col"">Nombre</th>
                    <th scope=""col"">Estado</th>
                </tr>
            </thead>
            <tbody id=""tiposmedicamentos"">
            </tbody>
        </table>
    </div>
</main>
<script>
    let resp = ");
#nullable restore
#line 27 "C:\Users\Mati\source\repos\DSSD-TP1\fuentes\grcpClient\WebApplication1\Pages\Administracion\TipoMedicamento.cshtml"
          Write(Html.Raw(Json.Serialize(@Model.ListTipoMedicamento)));

#line default
#line hidden
#nullable disable
            WriteLiteral(@";

    let tableMedicamentos = document.getElementById(""tiposmedicamentos"")
    resp.tipos.forEach(medicamento => {
        let tr = document.createElement(""tr"");
        addElement(medicamento, 'nombre', tr, false)
        addElement(medicamento, 'activo', tr, false)
        tableMedicamentos.appendChild(tr);
    });

    function addElement(element, property, parent, isTh) {
        let child = document.createElement(isTh ? 'th' : 'td');
        if (isTh) child.scope = ""row""
        if (property == 'activo') {
            let btn = document.createElement(""a"");
            btn.className = element[property] ? ""btn btn-success text-white"" : ""btn btn-danger text-white"";
            let label = document.createTextNode(element[property] ? ""ACTIVO"" : ""INACTIVO"");
            btn.appendChild(label);
            btn.style.width = ""100px"";
            btn.setAttribute('data-tipo', element['nombre']);
            btn.setAttribute('href', '?nombre=' + element['nombre'] + '&activo=' + element['activo");
            WriteLiteral("\']);\r\n            child.appendChild(btn);\r\n        } else {\r\n            child.appendChild(document.createTextNode(element[property]));\r\n        }\r\n        parent.appendChild(child);\r\n    }\r\n\r\n</script>\r\n");
        }
        #pragma warning restore 1998
        [global::Microsoft.AspNetCore.Mvc.Razor.Internal.RazorInjectAttribute]
        public global::Microsoft.AspNetCore.Mvc.ViewFeatures.IModelExpressionProvider ModelExpressionProvider { get; private set; }
        [global::Microsoft.AspNetCore.Mvc.Razor.Internal.RazorInjectAttribute]
        public global::Microsoft.AspNetCore.Mvc.IUrlHelper Url { get; private set; }
        [global::Microsoft.AspNetCore.Mvc.Razor.Internal.RazorInjectAttribute]
        public global::Microsoft.AspNetCore.Mvc.IViewComponentHelper Component { get; private set; }
        [global::Microsoft.AspNetCore.Mvc.Razor.Internal.RazorInjectAttribute]
        public global::Microsoft.AspNetCore.Mvc.Rendering.IJsonHelper Json { get; private set; }
        [global::Microsoft.AspNetCore.Mvc.Razor.Internal.RazorInjectAttribute]
        public global::Microsoft.AspNetCore.Mvc.Rendering.IHtmlHelper<WebApplication1.Pages.Administracion.TipoMedicamentoModel> Html { get; private set; }
        public global::Microsoft.AspNetCore.Mvc.ViewFeatures.ViewDataDictionary<WebApplication1.Pages.Administracion.TipoMedicamentoModel> ViewData => (global::Microsoft.AspNetCore.Mvc.ViewFeatures.ViewDataDictionary<WebApplication1.Pages.Administracion.TipoMedicamentoModel>)PageContext?.ViewData;
        public WebApplication1.Pages.Administracion.TipoMedicamentoModel Model => ViewData.Model;
    }
}
#pragma warning restore 1591
