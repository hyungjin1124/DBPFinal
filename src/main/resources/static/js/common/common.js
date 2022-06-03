$(() => {
  const swal = {
    textAlert : function (text) {
      Swal.fire({
        text: text,
        showClass: {
          popup:'',
        },
        hideClass: {
          popup:'',
        },
        allowOutsideClick: false
      }).then((result) => {
        if (!result.isConfirmed || result.isConfirmed) {
          $('#create-unitCost').focus();
        }
      });
    },
    titleAndText : function (title, text) {
      Swal.fire({
        title : title,
        text: text,
        showClass: {
          popup:'',
        },
        hideClass: {
          popup:'',
        },
        allowOutsideClick: false
      }).then((result) => {
        if (!result.isConfirmed || result.isConfirmed) {
        }
      });
    }
  }
});

  let pr_id = $("#btn-remove").val();
  $(function(){
  $('#btn-remove').click(function(){
    if(confirm("프로젝트를 삭제하시겠습니까?")){
      self.location.href = "/project/projectDelete?pr_id=" + pr_id;
    }
  });
});
